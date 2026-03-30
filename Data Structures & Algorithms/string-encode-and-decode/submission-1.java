class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(var s : strs){
           str.append(s.length());
           str.append("#");
           str.append(s);
        }
        System.out.println(str);
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int j = 0;
        int i = 0;
        while(i < str.length()){
            j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            j++;
            list.add(str.substring(j,j+len));
            i = j + len;
        }
        System.out.println(list);
        return list;
    }
}
