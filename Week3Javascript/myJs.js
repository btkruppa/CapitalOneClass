// "use strict";
// var can be used to declare a variable
var x = 5

// string can be created 3 ways
var y = 'some string' // this is just a string
var z = "another string"

// template literals
var current = `hello ${x + 10}
mulit line
more lines
even more lines`;

console.log('current = ' + current)

console.log("x has the value of " + x + " and y has the value of " + y);
console.log(`x has the value of ${x} and y has the value of ${y}`);

function add(param1, someOther) {
  return param1 + someOther;
}

function divide(one, two) {
  return one/two;
}

function truthyValue(test) {
  if(test) {
    return true;
  } else {
    return false;
  }
}

var add5 = function (num) {
  return 5+num;
}

function callMyFucntionWith2(fun) {
  return fun(2);
}

var user = {
	"id":1,
	"name":2,
	"accounts":[
    {
      "id":1,
      "balance":22.5
    },
    {
      "id":12,
      "balance":222.5
    }
  ]
}

function equlity(one, two) {
  if(one == two) {
    console.log("== true");
  } else {
    console.log("== false");
  }

  if(one === two) {
    console.log("=== true");
  } else {
    console.log("=== false");
  }
}


function varLet() {
  if(true){
    console.log(`b = ${b} hoisted`); // var declaration gets hoisted
    let a = 5;
    var b = 10;
  }
  console.log(`b = ${b}`);
  console.log(`a = ${a}`); // error a is not defined here
}

function outer() {
  let out = 5;
  function inner() {
    console.log(out); // all good
    let inn = 'in';
  }

  return inner;
}

function Person(name, age) {
  let na = name;
  let ag = age;

  this.getName = function() {
    return na;
  }
  this.setName = function(newName) {
    na = newName;
  }

  this.getAge = function() {
    return ag;
  }
  this.setAge = function(newAge) {
    ag = newAge;
  }

}

let closed = {}

function closure() {
  let x = 5;

  closed.close = function(param) {
    x = param;
  }
}

let arr = [
  {"name":'blake', "age":23},
  {"name":'puru', "age":28},
  {"name":"Rajesh", "age":"18"},
  {"name":"David", "age":51},
  {"name":"Uday", "age":16},
]

arr.filter((element) => {
  if(typeof(element.age) === "string") {
    return false;
  } else {
    return true;
  }
}).reduce ((acc, cur) => acc+cur,0)


let myFun = () => {
  // do something
}

let annonymous = function() {
  // technically a lambda
}

function someFun() {
  // do something
}
