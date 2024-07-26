public class Main {
    public static void main(String[] args) {
        Job coder = new Job("招聘 java 程序员");
        Job sales = new Job("招聘广告销售");

        Job c1 = (Job)coder.clone();
        Job s1 = (Job)sales.clone();
        System.out.println(c1.getJobDescription());
        System.out.println(s1.getJobDescription());

        Job c2 = (Job)coder.clone();
        Job s2 = (Job)sales.clone();
        System.out.println(c2.getJobDescription());
        System.out.println(s2.getJobDescription());
    }
}