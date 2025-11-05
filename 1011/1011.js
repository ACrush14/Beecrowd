var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var pi = 3.14159;
var r = parseInt(lines.shift());
var volume = (4 / 3) * pi * r ** 3;

console.log("VOLUME = " + volume.toFixed(3));
