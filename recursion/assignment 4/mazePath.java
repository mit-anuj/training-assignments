import java.util.ArrayList;

public class mazePath{
    static ArrayList<String>  getMazePath(int hori, int vert,int currHori,int currVert){
        if(currHori==hori && currVert>=vert){
            ArrayList<String> path = new ArrayList<String>();
            path.add("");
            return path;
        }
        ArrayList<String> finalPaths = new ArrayList<String>();
        if(currHori<hori){
            ArrayList<String> paths = getMazePath(hori, vert, currHori+1, currVert);
            for(String path : paths){
                finalPaths.add(path+"H");
                // finalPaths.add(path);
            }
        }
        if(currVert<vert){
            ArrayList<String> paths = getMazePath(hori, vert, currHori, currVert+1);
            for(String path : paths){
                finalPaths.add(path+"V");
                // finalPaths.add(path);
            }
        }
        return finalPaths;
    }
    public static void main(String[] args) {
        System.out.println(getMazePath(4, 4, 1, 1));
    }
}