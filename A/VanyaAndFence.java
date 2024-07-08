import java.util.Scanner;

/**
 * A. Vanya and Fence
 * https://codeforces.com/contest/677/problem/A
 */
public class VanyaAndFence  {
public static void main(String[] args) {
        //  Good Way
        Scanner sc=new Scanner(System.in);
        int numOfFriends=sc.nextInt();
        int wallHeight=sc.nextInt();
        int roadWidth=0;
    
        for (int i = 0; i < numOfFriends; i++) {
            roadWidth=sc.nextInt()>wallHeight? 2:1;
        }
        System.out.println(roadWidth);

 ////////////////////////////////////////////////////////////////////////////////////////////////////////

// //Way Detalied.
    //     Scanner sc = new Scanner(System.in);
    //     int numOfFriends = sc.nextInt();
    //     int wallHeight = sc.nextInt();
    //     int[] arrOfFriendsHeight = new int[numOfFriends];
    //     for (int i = 0; i < numOfFriends; i++){
    //         arrOfFriendsHeight[i] = sc.nextInt();
    //     }
    //     int roadWidth = 0;
    //     for (int i = 0; i < arrOfFriendsHeight.length; i++){
    //         if (arrOfFriendsHeight[i] > wallHeight){
    //             roadWidth+=2;
    //         }else {
    //             roadWidth+=1;
    //         }
    //     }
    //     System.out.println(roadWidth);


}

    
}