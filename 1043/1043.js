var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var [a, b, c] = lines.shift().split(" ").map(Number);

var valor = a + b + c;
var area = ((a + b) * c) / 2;

if (a < b + c && b < a + c && c < a + b) {
  console.log("Perimetro = " + valor.toFixed(1));
} else {
  console.log("Area = " + area.toFixed(1));
}
