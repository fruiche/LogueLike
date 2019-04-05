package dungeon;

import java.util.ArrayList;

class Partition {

	int core_x;			//部屋が生成されなかった場合に接続するマップx座標
	int core_y;			//部屋が生成されなかった場合に接続するマップy座標
	Room room;			//このパーティションに存在する部屋
	boolean isRoomGen;	//パーティションに部屋が生成されているか

	Partition(int x,int y)
	{
		core_x = x;
		core_y = y;
		isRoomGen = false;
	}
	void addRoom(Room r)
	{
		room = r;
	}
}

class Room {

	int start_x;		//パーティションx開始番号
	int start_y;		//パーティションy開始番号
	int length_x;		//パーティションx長さ
	int length_y;		//パーティションy長さ
	int genRatio;		//部屋生成確率

	Room(int sx,int sy,int lx,int ly,int gen)
	{
		start_x = sx;
		start_y = sy;
		length_x = lx;
		length_y = ly;
		genRatio = gen;
	}
}

class Passage {

	int partition1;	//接続する区画配列番号1
	int partition2;	//接続する区画配列番号2

	Passage(int p1,int p2)
	{
		partition1 = p1;
		partition2 = p2;
	}
}

public class Floor {

	int partition_number_x;		//横のパーティション数
	int partition_number_y;		//縦のパーティション数
	int tile_length_x;			//パーティション毎の横の長さ
	int tile_length_y;			//パーティション毎の縦の長さ

	ArrayList<Partition>	partition;
	ArrayList<Passage>		passage;
	int passageIndex;

	Floor(int pnx,int pny,int tlx,int tly)
	{
		partition_number_x = pnx;
		partition_number_y = pny;
		tile_length_x = tlx;
		tile_length_y = tly;

		partition = new ArrayList<Partition>();
		passage = new ArrayList<Passage>();
		passageIndex = 0;
	}

	void addRoom(int sx,int sy,int lx,int ly,int gen)
	{
		Room r = new Room(sx,sy,lx,ly,gen);

	}

}