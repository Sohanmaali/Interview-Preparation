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
