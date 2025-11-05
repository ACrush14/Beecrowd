var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var line = lines.shift().split(" ");

var A = parseFloat(line[0]);
var B = parseFloat(line[1]);
var C = parseFloat(line[2]);

var tri = (A * C) / 2;
var cir = 3.14159 * C * C;
var tra = ((A + B) / 2) * C;
var qua = B * B;
var ret = A * B;

console.log("TRIANGULO: " + tri.toFixed(3));
console.log("CIRCULO: " + cir.toFixed(3));
console.log("TRAPEZIO: " + tra.toFixed(3));
console.log("QUADRADO: " + qua.toFixed(3));
console.log("RETANGULO: " + ret.toFixed(3));
