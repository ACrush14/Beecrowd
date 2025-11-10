var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var valores = lines[0].split(" ").map(Number);

valores.sort((x, y) => y - x);

var [a, b, c] = valores;

if (a >= b + c) {
  console.log("NAO FORMA TRIANGULO");
} else {
  if (a * a == b * b + c * c) {
    console.log("TRIANGULO RETANGULO");
  } else if (a * a > b * b + c * c) {
    console.log("TRIANGULO OBTUSANGULO");
  } else if (a * a < b * b + c * c) {
    console.log("TRIANGULO ACUTANGULO");
  }
  if (a == b && a == c && b == c) {
    console.log("TRIANGULO EQUILATERO");
  } else if (a == b || a == c || b == c) {
    console.log("TRIANGULO ISOSCELES");
  }
}
