const array = require('fs').readFileSync('/dev/stdin').toString().split('\n');

const stack = [];
const result = [];

const len = array.shift();

for (let i = 0; i < len; i++) {        
    switch(array[i]) {
        case 'pop': 
        result.push(stack.pop() || -1);
        break;

        case 'size': 
        result.push(stack.length);
        break;

        case 'empty': 
        result.push(stack[0] ? 0 : 1);
        break;

        case 'top': 
        result.push(stack[stack.length - 1] || -1);
        break;

        default: 
        stack.push(array[i].split(" ")[1]);
        break;
    }
}

console.log(result.join('\n'));