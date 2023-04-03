const baseUrl = "http://localhost:5500/source/";
const baseUrlArray = [
  "http://localhost:5500/source/sys-system/",
  "http://localhost:5500/source/sys-user/",
  "http://localhost:5500/source/sys-storage/",
  "http://localhost:5500/source/sys-msg/",
  "http://localhost:5500/source/issue/",
  "http://localhost:5500/source/document/",
  "http://localhost:5500/source/component/",
  "http://localhost:5500/source/analysis/",
];

async function play() {
  // （文件子路径）二维数组
  const fileArray2 = await getAllFileArray(baseUrlArray);
  // （文件子路径）一维数组
  let fileArray = [];
  fileArray2.forEach((item) => {
    fileArray = fileArray.concat(item);
  });
  // 所有文件的文本内容
  const fileTextArray = await getAllFile(fileArray);
  const sqlArray = [];
  fileTextArray.forEach((item, index) => {
    try {
      sqlArray.push(parseObjectToSQL(parseTextToObject(item)));
    } catch {
      console.log(
        "%c " + fileArray[index] + "文件解析失败",
        "font-size:13px; background:pink; color:#bf2c9f;"
      );
    }
  });
  displayResult(sqlArray);
}

play();

// 展示解析结果
function displayResult(array) {
  const resultDocument = document.getElementById("result");
  array.forEach((item) => {
    const child = document.createElement("div");
    child.innerText = item;
    child.style["margin-bottom"] = "20px";
    resultDocument.appendChild(child);
  });
}

// 解析表对象得到ddl
function parseObjectToSQL(object) {
  let sql = "DROP table `" + object.tableName + "`;\n";
  sql += "CREATE TABLE `" + object.tableName + "` (\n";
  object.columns.forEach((item) => {
    sql += "`" + item.name + "` " + item.type + ",\n";
  });
  sql = sql.slice(0, sql.length - 2);
  sql += "\n);";
  return sql;
}

// 解析文件内容，得到字段名，字段类型，表名称
function parseTextToObject(text) {
  const result = {
    tableName: "",
    columns: [],
  };
  const tableNameRegExp = /database\s+column\s+([a-zA-Z_]+).[a-zA-Z_]+/g;
  const tableNameRegExp2 = /public\s+class\s+([a-zA-Z]+)/g;
  const columnRegExp =
    /private\s+(Long|String|Integer|boolean)\s+[a-zA-Z0-9]+;*/g;
  const columnMatchArray = text.match(columnRegExp);
  const tableMatchEesult =
    tableNameRegExp.exec(text) || tableNameRegExp2.exec(text);
  result.tableName = tableMatchEesult[1]
    .replace(tableMatchEesult[1][0], tableMatchEesult[1][0].toLowerCase())
    .replace(/([A-Z])/g, "_$1")
    .toLowerCase();
  columnMatchArray.forEach((item) => {
    const text = item.replace(";", "");
    const array = text.split(" ");
    const column = {};
    column.name = array[2];
    column.type = columnTypeMap[array[1]];
    result.columns.push(column);
  });
  return result;
}

// 批量读取文件
async function getAllFile(fileArray) {
  const promiseArray = [];
  fileArray.forEach((item) => {
    console.log(item);
    promiseArray.push(readFile(baseUrl + item));
  });
  return await Promise.all(promiseArray);
}

// 读取文件
function readFile(url) {
  return new Promise((resolve, rejext) => {
    const rawFile = new XMLHttpRequest();
    rawFile.open("GET", url, true);
    rawFile.onreadystatechange = function () {
      if (rawFile.readyState === 4) {
        if (rawFile.status === 200 || rawFile.status == 0) {
          const allText = rawFile.responseText;
          resolve(allText);
        }
      }
    };
    rawFile.send();
  });
}

// 批量读取文件列表
async function getAllFileArray(urlArray) {
  const promiseArray = [];
  urlArray.forEach((item) => {
    promiseArray.push(getFileArray(item));
  });
  return await Promise.all(promiseArray);
}

// 获取文件列表
function getFileArray(url) {
  const urlArray = url.split("/");
  const lastPath = urlArray[urlArray.length - 2];
  return new Promise((resolve, rejext) => {
    const rawFile = new XMLHttpRequest();
    rawFile.open("GET", url, true);
    rawFile.onreadystatechange = function () {
      if (rawFile.readyState === 4) {
        if (rawFile.status === 200 || rawFile.status == 0) {
          const allText = rawFile.responseText;
          const pathNameRegExp = new RegExp(`${lastPath}\/[a-zA-Z]+.java`, "g");
          const array = allText.match(pathNameRegExp);
          resolve(array);
        }
      }
    };
    rawFile.send();
  });
}
