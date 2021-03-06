package controllers;

/**
 * Created by Ariel on 25/12/2015.
 */
import play.*;
import play.mvc.*;

import views.html.*;

import javax.xml.transform.Result;
import java.lang.String;
import java.security.SecureRandom;
public class monitorCard extends Controller{
    private String id ;
    private String dateHeader;
    private String img;
    private String monitorName;
    private String monitorLevel;
    private String monitorProdact;
    private String monitorSystem;
    private String monitorExplain;
    private String monitorType;
    private int status;
    private int views;
    public monitorCard (String id,String dateHeader,String img,String monitorName,String monitorLevel,String monitorProdact,String monitorSystem,String monitorExplain,String monitorType,int status,int views){
        this.id = id;
        this.dateHeader = dateHeader;
        this.img = img;
        this.monitorName = monitorName;
        this.monitorLevel = monitorLevel;
        this.monitorProdact = monitorProdact;
        this.monitorSystem = monitorSystem;
        this.monitorExplain = monitorExplain;
        this.monitorType = monitorType;
        this.status = status;
        this.views = views;
    }
    public monitorCard(monitorCard card){
        this.id = card.getId();
        this.dateHeader = card.getDateHeader();
        this.img = card.getImg();
        this.monitorName = card.getMonitorName();
        this.monitorLevel = card.getMonitorLevel();
        this.monitorProdact = card.getMonitorProdact();
        this.monitorSystem = card.getMonitorSystem();
        this.monitorExplain = card.getMonitorExplain();
        this.monitorType = card.getMonitorType();
        this.status = card.getStatus();
        this.views = card.status;
    }


    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id =id;
    }

    public String getDateHeader(){
        return this.dateHeader;
    }
    public void setDateHeader(String dateHeader){
        this.dateHeader = dateHeader;
    }

    public String getImg(){
        return this.img;
    }
    public void setImg(String img){
        this.img = img;
    }

    public String getMonitorName(){
        return this.monitorName;
    }
    public void setMonitorName(String monitorName){
        this.monitorName = monitorName;
    }

    public String getMonitorLevel(){
        return this.monitorLevel;
    }
    public void setMonitorLevel(String monitorLevel){
        this.monitorLevel = monitorLevel;
    }

    public String getMonitorProdact(){
        return this.monitorProdact;
    }
    public void setMonitorProdact(String monitorProdact){
        this.monitorProdact = monitorProdact;
    }

    public String getMonitorSystem(){
        return this.monitorSystem;
    }
    public void setMonitorSystem(String monitorSystem){
        this.monitorSystem = monitorSystem;
    }

    public String getMonitorExplain(){
        return this.monitorExplain;
    }
    public void setMonitorExplain(String monitorExplain){
        this.monitorExplain = monitorExplain;
    }

    public String getMonitorType(){
        return this.monitorType;
    }
    public void setMonitorType(String monitorType){
        this.monitorType = monitorType;
    }

    public int getStatus(){
        return this.status;
    }
    public void setStatus(int status){
        this.status = status;
    }
    public void incStatus(){
        this.status++;
    }

    public int getViews(){
        return this.views;
    }
    public void setViews(int views){
        this.views = views;
    }
    public void incViews(){
        this.views++;
    }
}
