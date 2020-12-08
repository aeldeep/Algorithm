package com.eldeep;

public class FreeSpace {

	
	public static void main(String[] args) {
		String S="my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";
		//System.out.println(S);
		solution(S);
	}
	public static String solution(String S) {
        // write your code in Java SE 8
		String[] lines = S.split("\r\n|\r|\n");
		int lNum= lines.length;
		
			int music=0;
			int img=0;
			int movies=0;
			int other=0;
			if (lNum<500) {
		for (int i = 0 ; i<lNum;i++)
		{
			lines[i].split(" ");
			String size = lines[i].substring(lines[i].indexOf(" ")+1, lines[i].length()-1); 
			int number = Integer.parseInt(size); 
			if (lines[i].contains(".mp3") ||lines[i].contains(".acc") ||lines[i].contains(".flac"))
			{
				music+=number;
			}else if (lines[i].contains(".jpg") ||lines[i].contains(".bmp") ||lines[i].contains(".gif"))
			{
				img+=number;
			}else if(lines[i].contains(".mp4") ||lines[i].contains(".avi") ||lines[i].contains(".mkv")){
				movies+=number;
			}else {
				other+=number;
			}
			
		}
			}

		String result="music "+music+"b\n"+"images "+img+"b\n"+"movies "+movies+"b\n"+"other "+other+"b";
		System.out.println(result);
		return result;
		
    }
}
