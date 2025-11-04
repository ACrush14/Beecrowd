var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var π = 3.14159;
var raio = parseFloat(lines.shift());

area = π * raio * raio;

console.log("A=" + area.toFixed(4));
