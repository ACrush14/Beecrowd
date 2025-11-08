var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var [a, b] = lines.shift().split(" ").map(Number);

if (a % b === 0 || b % a === 0) {
  console.log("Sao Multiplos");
} else {
  console.log("Nao sao Multiplos");
}
a;
