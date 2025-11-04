var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var ns = lines.shift().split(" ");

var n1 = parseFloat(ns[0]);
var n2 = parseFloat(ns[1]);
var n3 = parseFloat(ns[2]);
var n4 = parseFloat(ns[3]);

n1 = n1 * 2;
n2 = n2 * 3;
n3 = n3 * 4;

var media = (n1 + n2 + n3 + n4) / 10;

console.log("Media: " + media.toFixed(1));

if (media < 5) {
  console.log("Aluno reprovado.");
} else if (media >= 7) {
  console.log("Aluno aprovado.");
} else {
  console.log("Aluno em exame.");

  var n5 = parseFloat(lines.shift());

  console.log("Nota do exame: " + n5.toFixed(1));

  var n_media = (media + n5) / 2;

  if (n_media < 5) {
    console.log("Aluno reprovado.");
  } else {
    console.log("Aluno aprovado.");
  }

  console.log("Media final: " + n_media.toFixed(1));
}
