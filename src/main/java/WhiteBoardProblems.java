public class WhiteBoardProblems {

    public int getIndexOfValue(int[] enteredArray, int valueToGet) { //Linear search
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


    public int[] addElementToArray(int[] array, int intToAddToArray, int indexToPlaceNewInt){ // Add to specific index of an array

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


    }

    //This second one is the same as the first, except restricted by not being able to use conditionals:
    //RESTRICTION: NO IF/ELSE STATEMENTS IN YOUR SOLUTION.
    public int[] addElementToArrayAgain(int[] array, int intToAddToArray, int indexToPlaceNewInt){ // Add to specific index of an array
        //Joe's solution;
            int[] result = new int[array.length + 1];

        for (int i = 0; i < indexToPlaceNewInt; i++) {
            result[i] = array[i];
        }

        result[indexToPlaceNewInt] = intToAddToArray;

        for (int i = indexToPlaceNewInt + 1; i < result.length; i++){
            result[i] = array[i - 1];
        }

        return result;
    }



}
