package algods.mecoding;

public class Calculator {
    public static boolean isEven(int n){
        if (n%2 != 0){
            return false;
        }
        return true;
    }

    public static int adding(int a, int b){
        return a+b;
    }

    public static int max(int a, int b){
        if (a<b){
            return b;
        }else{
            return a;
        }
    }

    public static boolean isPositive(int n){
        if (n>0){
            return true;
        }else{
            return false;
        }
    }
    //Länge String
    public static int stringLength(String text){
        int length = text.length();
        return length;
    }

    public static int doubleNumber(int n){
        return (n*2);
    }

    public static int min(int a, int b){
        if (a<b){
            return a;
        }else{
            return b;
        }
    }

    public static String repeatTwice(String text){
        return text + text;
    }

    public static boolean isDivisibleBy3(int n){
        return (n%3 == 0);
    }

    public static int maxOfThree(int a, int b, int c){
        if (a >= b && a >= c){
            return a;
        }else if (b >= c && b >= a){
            return b;
        }else {
            return c;
        }
    }

    ///FOR Schleife, zähle zusammen bis n
    public static int sumUp2(int n){
        int sum=0;
        for (int i = 1; i <= n; i++){
            sum = sum +1;
            ///sum += i; geht auch
        }
        return sum;
    }

    public static int sumArray(int[] numbers){
        int sum = 0;
        for (int i= 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    public static int countPositive(int[] numbers){
        int count = 0;
        
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > 0){
                count++;
            }
        }
        return count;
    }

    public static int countEven(int[] numbers){
        int count = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i]%2==0){
                count++;
            }
        }
        return count;
    }
 
    
        public static int findFirstPositive(int[] numbers){
            for (int i = 0; i < numbers.length; i++){
                if (numbers[i]>0){
                    return numbers[i];
                }
            }
        return -1;
    }


        public static int FindFirstPositiveIndex(int [] numbers){
            for (int i = 0; i < numbers.length; i++)
                if (numbers[i]>0){
                    return i;
                }
                return -1;
        }

        public static int findMax(int[] numbers){
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max){
                max =numbers[i];
            }
        }
        return max;
    }

        public static int sumOdd(int[] numbers){
            int sum = 0;
            for (int i=0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                sum += numbers[i];
            }
        }
        return sum;
    }

        public static boolean containsZero(int[] numbers){
            for (int i = 0; i < numbers.length; i++){
                if (numbers[i] == 0){
                    return true;
                }
            }
            return false;
}

        public static boolean containsNegative(int[] numbers){
            for (int i = 0; i < numbers.length; i++){
                if (numbers[i] < 0){
                    return true;
                }
            }
            return false;
        }

        public static int countZeros(int[] numbers){
            int zeros=0;
            for (int i=0; i < numbers.length; i++){
                if (numbers[i]==0){
                    zeros++;
                }
            }
            return zeros;
        }

        public static boolean allPositive(int[] numbers){
            for (int i = 0; i< numbers.length; i++){
                if (numbers[i]<=0){
                    return false;
                }
            }
            return true;
        }

        public static int countNegative(int[] numbers){
            int count = 0;
            for (int i = 0; i< numbers.length; i++){
                if (numbers[i]<0){
                    count++;
                }
            }
            return count;
        }

        public static int findLastPositive(int[] numbers){
            for (int i = numbers.length - 1; i >= 0; i--){
                if (numbers[i]> 0){
                    return numbers[i];
                }
            }
            return -1;
        }

        public static int sumGreaterThanTen(int[] numbers){
            int sum = 0;
            for (int i = 0; i < numbers.length; i++){
                if (numbers[i]>10){
                    sum += numbers[i];
                }
            }
            return sum;
        }

        public static boolean allEven(int[] numbers){
            for (int i = 0; i < numbers.length; i++){
                if (numbers[i]%2!=0){
                    return false;
                }
            }
            return true;
        }

        public static int countBetween(int[] numbers, int min, int max){
            
            int count = 0;
            for (int i = 0; i < numbers.length; i++){
                if (numbers[i] >= min && numbers[i] <= max){
                    count++;
                }
            }
            return count;
        }

        public static int maxInArray(int[] numbers){
            int max = numbers[0];
            for (int i = 0; i < numbers.length; i++){
                if (numbers[i]> max){
                    max = numbers[i];
                }
            }
            return max;
        }

        public static int secondSmallest(int[] numbers){
            int smallest = numbers[0];
            int secondSmallest = numbers[1];
            if (smallest > secondSmallest){
                smallest = numbers[1];
            secondSmallest = numbers[0];
            }
            for (int i = 2; i< numbers.length; i++){
                if (numbers[i] < smallest){
                    secondSmallest = smallest;
                    smallest = numbers[i];
            } else if (numbers[i] < secondSmallest){
                    secondSmallest = numbers[i];
                    }
                }
                return secondSmallest;
            

        }

        public static boolean hasAdjacentEqual(int[] numbers){
            for (int i = 0; i< numbers.length -1; i++){
                if (numbers[i]==numbers[i+1]){
                    return true;
                }
            }
            return false;
        }

        public static int maxNeighborDifference(int[] numbers){
            int maxDiff = 0;
            for (int i= 0; i< numbers.length -1; i++){
                int diff = Math.abs(numbers[i]-numbers[i+1]);
                if (diff > maxDiff){
                    maxDiff = diff;
                }
            }
            return maxDiff;
        }

        public static int secondLargest(int[] numbers){
            int firstLargest = numbers[0];
            int secondLargest = -1;
            for (int i = 0; i < numbers.length; i++){
                if (numbers[i] > firstLargest){
                    firstLargest = numbers[i];
                }
            }

            for (int j = 0; j < numbers.length; j++){
                if ((numbers[j] > secondLargest) && (numbers[j] != firstLargest)){
                    secondLargest = numbers[j];
                }
            }
            return secondLargest;
        }


        public static boolean isStrictlyIncreasing(int[] numbers){
            for (int i = 0; i < numbers.length - 1 ; i++){
                if (numbers[i] >= numbers[i+1]){
                    return false;        
                }
            }
            return true;
        }

        public static int smallestPositive(int[] numbers){
            int smallestPositive = 0;
            boolean found = false;

            for (int i = 0; i < numbers.length; i++){
                if (numbers[i] > 0){
                    if (!found || numbers[i] < smallestPositive){
                        smallestPositive = numbers[i];
                        found = true;
                    }
                }
            }
            
            if (!found) {
                return -1;
            }

            return smallestPositive;
        }

        

    }