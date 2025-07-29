// console.log()

// console.log(console.log("hello"));
// ------------------------------------------------------------------------------------------------------------------

// Reverse Word
// let str = "i am sohan"
// let rev = str.split(" ").reverse().join(" ")
// console.log(rev);

// First Latter Capital
// let str = "i am sohan";
// let newstr = str.split(" ").map((word)=>word.charAt(0).toUpperCase()+ word.slice(1)).join(" ")
// console.log(newstr);

// Check Palindrom
// let str = "123";
// let newstr = str.split("").reverse().join("")
// console.log(newstr==str);

// Swap Strig
// let str1 = "sohan"
// let str2 = "maali"
// str1 = str1+str2
// str2 = str1.slice(0,str1.length-str2.length);
// str1 = str1.slice(str2.length);
// console.log("Str1",str1);
// console.log("Str2",str2);

// Factorial
// function fact(n) {
//   return n === 0 ? 1 : n * fact(n - 1);
// }
// console.log(fact(5));

// Flat Map
// const nested = [1, [2, [3, 4], 5]];
// const newArray = nested.flat(Infinity)
// console.log(newArray);

// Check Anagram
// const isAnagram = (str1, str2) =>
//   str1.split("").sort().join() === str2.split("").sort().join();
// console.log(isAnagram("listen", "silent"));

// Sum of Array Element
// const arr = [1, 2, 3, 4];
// let sum  =arr.reduce((acc,cur)=>acc+cur,0)
// console.log(sum);

// second largest number
// function secondLargest(ar) {
//   let u = ar.sort((a, b) => b - a);
//   return u[1];
// }
// console.log(secondLargest([50, 10, 20, 20, 30]));

// swap Number
// let a = 3;
// let b = 8;
// a = a + b;
// b = a - b;
// a = a - b;
// console.log(a);
// console.log(b);

// let a = 3;
// let b = 8;
// a = a * b;
// b = a / b;
// a = a / b;
// console.log(a);
// console.log(b);

// Reverse Number
// let a = 894;
// let rev = 0;
// for (; a > 0; a = Math.floor(a / 10)) {
//   let tem = a % 10;
//   rev = tem + rev * 10;
// }
// console.log(rev);

// Delete Duplicate
// let arr = [4, 3, 5, 4,2, 3, 6, 6];
// for (let i = 0; i < arr.length; i++) {
//   let n = arr[i];
//   for (let j = i + 1; j < arr.length; j++) {
//     if (n === arr[j]) {
//       for (let k = j; k < arr.length - 1; k++) {
//         arr[k] = arr[k + 1];
//       }
//       arr.pop();
//     }
//   }
// }
// console.log(arr);

// Find Max
// let arr = [4, 3, 5, 40, 2, 3, 6, 6];
// let max = 0;
// for (let i = 0; i < arr.length; i++) if (arr[i] > max) max = arr[i];
// console.log(max);

// Find Min
// let arr = [4, 3, 5, 40, 1, 3, 6, 6];
// let min = arr[0];
// for (let i = 0; i < arr.length; i++) if (arr[i] < min) min = arr[i];
// console.log(min);

// Find Element
// let arr = [4, 3, 5, 40, 1, 3, 6, 6];
// let n = 4;
// let is = arr.find((i) => i == n);
// console.log(is);
