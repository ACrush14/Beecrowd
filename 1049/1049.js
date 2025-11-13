var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var a = String(lines.shift());
var b = String(lines.shift());
var c = String(lines.shift());

if (a == "vertebrado") {
  if (b == "ave") {
    if (c == "carnivoro") {
      console.log("aguia");
    } else {
      console.log("pomba");
    }
  } else if (b == "mamifero") {
    if (c == "onivoro") {
      console.log("homem");
    } else {
      console.log("vaca");
    }
  }
} else if (a == "invertebrado") {
  if (b == "inseto") {
    if (c == "hematofago") {
      console.log("pulga");
    } else {
      console.log("lagarta");
    }
  } else if (b == "anelideo") {
    if (c == "hematofago") {
      console.log("sanguessuga");
    } else {
      console.log("minhoca");
    }
  }
}
