var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var dist = parseInt(lines.shift());

var tempo = 2;

var res = dist * tempo;

console.log(res + " minutos");
