fun lonelyinteger(a: Array<Int>): Int {
    // Write your code here
    for(i in a.indices){
        var counter = 0
        for(j in a.indices){
            if(a[i]==a[j]){
                counter++
            }
        }
        if(counter == 1) {
            return a[i]
        }
    }
    return 0
}