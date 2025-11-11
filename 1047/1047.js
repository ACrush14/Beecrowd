var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var valores = lines[0].split(" ");

var horaInicial = parseInt(valores[0]);
var minInicial = parseInt(valores[1]);
var horaFinal = parseInt(valores[2]);
var minFinal = parseInt(valores[3]);

var totalInicial = horaInicial * 60 + minInicial;
var totalFinal = horaFinal * 60 + minFinal;

var totalMinutos = 0;

if (totalInicial == totalFinal) {
  totalMinutos = 24 * 60;
} else if (totalInicial < totalFinal) {
  totalMinutos = totalFinal - totalInicial;
} else {
  totalMinutos = totalFinal + 24 * 60 - totalInicial;
}

var hTotal = Math.floor(totalMinutos / 60);
var mTotal = totalMinutos % 60;

console.log("O JOGO DUROU " + hTotal + " HORA(S) E " + mTotal + " MINUTO(S)");
