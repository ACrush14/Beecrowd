var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var ddd_array = {
  61: "Brasilia",
  71: "Salvador",
  11: "Sao Paulo",
  21: "Rio de Janeiro",
  32: "Juiz de Fora",
  19: "Campinas",
  27: "Vitoria",
  31: "Belo Horizonte",
};

var a = parseInt(lines.shift());

if (ddd_array[a]) {
  console.log(ddd_array[a]);
} else {
  console.log("DDD nao cadastrado");
}
