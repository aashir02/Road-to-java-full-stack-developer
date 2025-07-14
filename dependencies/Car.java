class Car{
    private String mName;
    void setmName(String mName){
        this.mName=mName;
    }
    String getmName(){
        return this.mName;
    }
    Car(){

    }
    private Engine e = new Engine();
    Engine getEngine(){
        return e;
    }
    

}