public class Paperwork {
    /*
    * Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.
    Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.
    * */
    public static void main(String[] args) {
        System.out.println(paperWork(5,-5));
    }

    public static int paperWork(int n, int m)
    {
        return (n>0&&m>0)?n*m:0;
    }
}
