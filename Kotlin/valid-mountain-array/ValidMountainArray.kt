fun validMountainArray(A: IntArray): Boolean{
    var bandera = false
    var contSube =0
    var contBaja=0
    if (A.size<=3){
        return bandera
    }
   for (temp in 0 until  A.size -1){
       if (A[temp]<A[temp+1])
           contSube++
   }
    if((contSube==A.size -1)||(contSube==0))
        return bandera
    for (temp in contSube until A.size-1){
    if(A[temp]>A[temp+1])
    contBaja++}
    if(contBaja==0)
        return bandera
    if(contBaja+contSube==A.size -1)
        bandera=true
        return bandera
}
