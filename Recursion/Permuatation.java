// void permute(String s, StringBuilder ds, boolean[] used) {
//     if (ds.length() == s.length()) {
//         System.out.println(ds.toString());
//         return;
//     }

//     for (int i = 0; i < s.length(); i++) {
//         if (used[i]) continue;
        // here used is boolean with same size has array 
//         used[i] = true;
//         ds.append(s.charAt(i));

//         permute(s, ds, used);

//         ds.deleteCharAt(ds.length() - 1);
//         used[i] = false;
//     }
// }

