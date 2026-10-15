class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.replace("-", "").toUpperCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<s.length();i++) {
            if(i>0 && (s.length()-i)%k==0) {
                sb.append("-");
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}