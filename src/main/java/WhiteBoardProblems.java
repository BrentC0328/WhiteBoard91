public class WhiteBoardProblems {

    public int getIndexOfValue(int[] enteredArray, int valueToGet) {
        int result = -1;

        for(int i = 0; i < enteredArray.length; i++){
            if (enteredArray[i] == valueToGet){
                result = i;
                return result;
            }
        }
        return result;
    }


    public int[] getSmallestToLargest(int[] arr) { //Simple Sort

            for(int i = 0; i < arr.length ; i++) {

                for (int j = 0; j < arr.length - 1; j++) {
                    int valueOfCurrentNumber = arr[j];
                    int valueOfNextNumber = arr[j + 1];

                    if (valueOfCurrentNumber > valueOfNextNumber) {
                        arr[j] = valueOfNextNumber;
                        arr[j + 1] = valueOfCurrentNumber;
                    }
                }
            }

            return arr;
        }


    public int[] addElementToArray(int[] array, int intToAddToArray, int indexToPlaceNewInt){

        int[] result = new int[array.length + 1];
        int index = 0;

        for (int i = 0; i < result.length -1; i++){
            if (i == indexToPlaceNewInt){
                result[index] = intToAddToArray;
                result[index + 1] = array[index];
                index++;
                index++;
            } else { result[index] = array[i];
                index++;
            }
        }
        return result;

        //Joe's solution (also works);
        //    int[] result = new int[array.length + 1];
//
//        for (int i = 0; i < indexToPlaceNewInt; i++) {
//            result[i] = array[i];
//        }
//
//        result[indexToPlaceNewInt] = intToAddToArray;
//
//        for (int i = indexToPlaceNewInt + 1; i < result.length; i++){
//            result[i] = array[i - 1];
//        }
    }


}
