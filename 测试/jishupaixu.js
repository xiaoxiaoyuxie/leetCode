

function int test (int a){
    let array = [3,2,1,2,3,2,0,4];
    let counts = [];
    for (let v of array){
        counts[v] = (counts[v] || 0) + 1;
    }
    console.log(counts);
}