// public class Birthday {
//     private int day;
//     private String month;
//     private int year;
//     private String name;

//     public Birthday(int day, String month, int year, String name) {
//             this.day = day;
//             this.month = month;
//             this.year = year;
//             this.name = name;
//     }

//     public void setDay(int day) {
//             this.day = day;
//     }

//     public int getDay() {
//             return day;
//     }

//     public void setMonth(String month) {
//             this.month = month;
//     }

//     public String getMonth() {
//             return month;
//     }

//     public void setYear(int year) {
//             this.year = year;
//     }

//     public int getYear() {
//             return year;
//     }
//     public String toString(){
//         return this.name+","+this.day+" "+this.month+" "+this.year;
//     }

//     public static void main(String[] args) {
//         Birthday obj=new Birthday(29, "NOVEMBER", 1999, "XYZ");
//         String data=obj.toString();
//         System.out.println(data);
//     }
// }