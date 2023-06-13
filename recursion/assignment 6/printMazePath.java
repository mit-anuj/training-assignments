public class printMazePath {
    static void printPath(int hori,int vert,int currHori,int currVert, String path){
        if(currHori==hori && currVert==vert){
            System.out.println(path);
            return;
        }
        if(currHori<hori){
            printPath(hori, vert, currHori+1, currVert, path+"H");
        }
        if(currVert<vert){
            printPath(hori, vert, currHori, currVert+1, path+"V");
        }
    }
    public static void main(String[] args) {
        printPath(3, 3, 1, 1, "");
    }
}
