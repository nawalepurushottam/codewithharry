/*
1. Ways to print in JavaScript
console.log("Hello World");
alert("Hi");
document.write("this is document write");



2. JavaScript console API
console.log("Hello World", 2 + 3, "Another log");
console.warn("this is a warning");
console.error("this is an error")
*/


// 3. JavaScript Variables
// What are variables? - Containers to store data values
var num1 = 25;
var num2 = 32;
// console.log(num1+num2);


/*
// 4. Data types in JavaScript
At a very high level, there are two types of data types in JavaScript
1. Primitive data types : undefined, null, number, string, boolean, symbol
2. Reference data types : Arrays and Objects
*/
// Numbers
var num3 = 43;
var num4 = 92;

// String
var str1 = "This is a string";
var str2 = "This is also a string";

// Objects
var Dict = { Science: 77, Math: 99, English: 88 }
// console.log(Dict);

// Boolean
var x = true;
var y = false;
// console.log(x,y);

// Undefined
// var und=undefined;
var und;
// console.log(und);

// Null
var n = null;
// console.log(n);

// Array
var arr = [1, 2, "abc", 4, 5];
// console.log(arr);



// 5. Operators in JavaScript
// Arthmetic Operators
var a = 23;
var b = 32;
// console.log("The value of a + b is ", a + b);
// console.log("The value of a - b is ", a - b);
// console.log("The value of a * b is ", a * b);
// console.log("The value of a / b is ", a / b);

// Assignment Operators
var c = a;
// c+=2; means c=c+2;
// c-=2;
// c*=2;
// c/=2;
// console.log(c);

// Comparison Operators
var m = 56;
var n = 64;
// console.log(m==n);
// console.log(m<=n);
// console.log(m>=n);
// console.log(m<n);
// console.log(m>n);

/*
Logical Operators
Logical AND
console.log(true && true);
console.log(true && false);
console.log(false && true);
console.log(false && false);

Logical OR
console.log(true || true);
console.log(true || false);
console.log(false || true);
console.log(false || false);

Logical NOT
console.log(!true);
console.log(!false);
*/



// 6. Functions in JavaScript
// DRY Do not repeat youself
function avg(a, b) {
    c = (a + b) / 2;
    return c;
}
c1 = avg(4, 6);
c2 = avg(5, 7);
// console.log(c1,c2)

// Arrow Fuctions
// function summ(a,b){
//     return a+b;
// }

summ=(a,b)=>{
    return a+b;
}



/*
// 7. Conditonal Statements in JavaScript
var age=15;

// single if statement
if(age>19){
    console.log("You are an adult");
}

// if else statement
if(age>19){
    console.log("You are an adult");
}
else{
    console.log("You are a teenager");
}

// if else ladder
if(age<20 && age>12){
    console.log("You are a teenager");
}
else if(age>19){
    console.log("You are an adult");
}
else{
    console.log("Your are a kid")
}
console.log("End of Ladder")
*/



/*
// 8. Loops in JavaScript
var arr = [1, 2, 3, 4, 5, 6, 7];
console.log(arr);
for (var i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}

arr.forEach(function (element) {
    console.log(element);
})


// const ac = 0;
// ac++;
// ac=ac+1;
let j = 0;

while (j < arr.length) {
    console.log(arr[j]);
    j++;
}

do {
    console.log(arr[j]);
    j++;
} while (j < arr.length);
*/




// // 9. Break Continue Statement
// var arr = [1, 2, 3, 4, 5, 6, 7];
// for (var i = 0; i < arr.length; i++) {
//     if(i==2){
//         // break;
//         continue;
//     }
//     console.log(arr[i]);
// }


/*
// 10. Array Methods
let myArr=["hello",23,true,40.2,null];
console.log(myArr.length);
myArr.pop();
myArr.push('coding');
myArr.unshift(53);
myArr.shift();
const newLen=myArr.unshift(53);
console.log(newLen);
console.log(myArr);
*/



// // 11. String Methods in JavaScript
// let String1 = "This is my lovely string, lovely";
// console.log(String1.length);
// console.log(String1.indexOf("lovely"));
// console.log(String1.lastIndexOf("lovely"));
// console.log(String1.slice(2, 4));
// String2 = String1.replace("This", "That");
// String2 = String2.replace("lovely", "amazing");
// console.log(String1, String2);



// // 12. Dates
// let myDate = new Date();
// console.log(myDate);
// console.log(myDate.getTime());
// console.log(myDate.getFullYear());
// console.log(myDate.getDay());



/*
// 13. DOM Manipulation
let elem = document.getElementById('click');
// console.log(elem);

let elemClass = document.getElementsByClassName('container');
// console.log(elemClass);
// elemClass[0].style.background="yellow";
elemClass[0].classList.add("bg-primary");
elemClass[0].classList.add("text-success");
elemClass[0].classList.remove('text-success');
console.log(elem.innerHTML);
console.log(elem.innerText);
console.log(elemClass[0].innerHTML);
console.log(elemClass[0].innerText);

tn = document.getElementsByTagName("div");
console.log(tn);
createdElement = document.createElement('p');
createdElement.innerText = "This is a created paragraph.";
tn[0].appendChild(createdElement);
createdElement2 = document.createElement('b');
createdElement2.innerText = "This is a created bold.";
tn[0].replaceChild(createdElement2, createdElement);
// removeChild(element);  --> removes an element

//Selecting using query
sel = document.querySelector('.container');
console.log(sel);
sel = document.querySelectorAll('.container');
console.log(sel);
*/


/*
// 14. Events in JavaScript
function clicked(){
    console.log("The Button was clicked.")
}
window.onload=function(){
    console.log("The Document was loaded.")
}
firstContainer.addEventListener('click',function(){
    document.querySelectorAll('.container')[1].innerHTML="<b>We have clicked</b>";
    console.log("clicked on Container");
})
firstContainer.addEventListener('mouseover',function(){
    console.log("Mouse on Container");
})
firstContainer.addEventListener('mouseout',function(){
    console.log("Mouse out of Container");
})
let prevHTML=document.querySelectorAll('.container')[1].innerHTML;
firstContainer.addEventListener('mouseup',function(){
    document.querySelectorAll('.container')[1].innerHTML=prevHTML;
    console.log("Mouse up when clicked on Container");
})
firstContainer.addEventListener('mousedown',function(){
    document.querySelectorAll('.container')[1].innerHTML="<b>We have clicked</b>";
    console.log("Mouse down of Container");
})
*/


// 15. SetTimeout and setInterval
logKaro=()=>{
    document.querySelectorAll('.container')[1].innerHTML="<b>Set interval fired</b>";
    console.log("I am your log");
}
// clr1=setTimeout(logKaro,5000);
// clr2=setInterval(logKaro,2000);
// use clearInterval(clr2)/clearTimeout(clr1) to cancel setInterval/setTimeout


// 16. LocalStorage
// localStorage.setItem('Name','Purushottam');
// localStorage;
// localStorage.getItem('Name');
// localStorage.removeItem('Name');
// localStorage.clear();


// 17. JSON
// obj={Name:'Purushottam',length:1, a: {this:'tha\\"t'}};
// jso=JSON.stringify(obj);
// console.log(jso);
// console.log(typeof jso);
// parsed=JSON.parse(`{"Name":"Purushottam","length":1,"a":{"this":"that"}}`);
// console.log(parsed);
// Template Literals - Bakcticks
a=26;
// console.log(`This is my ${a}`);