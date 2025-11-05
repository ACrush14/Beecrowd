var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var tempo = parseInt(lines.shift());
var vel = parseInt(lines.shift());

var res = (tempo * vel) / 12;

console.log(res.toFixed(3));
