var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var [A, B, C] = lines.shift().split(" ").map(Number);

var bas = B * B - 4 * A * C;

if (bas < 0 || A === 0) {
  console.log("Impossivel calcular");
} else {
  bas = Math.sqrt(bas);
  var R1 = (-B + bas) / (2 * A);
  var R2 = (-B - bas) / (2 * A);
  console.log("R1 = " + R1.toFixed(5));
  console.log("R2 = " + R2.toFixed(5));
}
