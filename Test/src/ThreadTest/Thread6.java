package ThreadTest;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-09-20
 * Time: 15:57
 **/
public class Thread6 implements Callable<Boolean> {
    public String url;//网络图片地址
    public String name;//保存图片的文件名

    public Thread6(String url,String name) {
        this.url = url;
        this.name = name;
    }

    //下载图片的执行体
    @Override
    public Boolean call() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件名为："+name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Thread6 t1 = new Thread6("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1600539567312&di=ea86898261c1e90276b34a4e66d81997&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201704%2F30%2F20170430200545_xHzT4.jpeg","1.jpg");
        Thread6 t2 = new Thread6("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=134661062,1439993962&fm=26&gp=0.jpg","2.jpg");
        Thread6 t3 = new Thread6("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1600539694037&di=9eb977d29c43645a77c61e4db6548b06&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201809%2F21%2F20180921214202_n4wzH.thumb.700_0.jpeg","3.jpg");

        //创建执行服务(new了一个池子，池子中有三个线程)
        ExecutorService ser = Executors.newFixedThreadPool(3);

        //提交执行
        Future<Boolean> r1 = ser.submit(t1);
        Future<Boolean> r2 = ser.submit(t2);
        Future<Boolean> r3 = ser.submit(t3);

        //获取结果
        boolean rs1 = r1.get();
        boolean rs2 = r1.get();
        boolean rs3 = r1.get();


        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);

        //关闭服务
        ser.shutdownNow();
    }


}

/*class WebDownloader{
    //下载方法
    public void downloader(String url,String name) {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}*/

