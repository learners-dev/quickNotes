var missing = function(array) {
    var n = array.length;
    var expectedSum = ((n + 1)* (n + 2)) / 2;
    var actualSum = 0;
    array.forEach(current => {
        actualSum+=current;
    })
    console.log(expectedSum - actualSum);
}

missing(array);
var array = [1, 2, 3, 4];


