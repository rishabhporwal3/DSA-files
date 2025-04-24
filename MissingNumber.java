class MissingNumber {
    public static int missingNum(int arr[]) {
        // code here
        // boolean array of size arr +1
        boolean[] b = new boolean[arr.length + 1];
        
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            b[x - 1] = true;
        }
        
        for (int j = 0; j < b.length; j++) {
            if (b[j] == false){
                return j + 1;
            }
        }
        
        return 0;
    }
}
