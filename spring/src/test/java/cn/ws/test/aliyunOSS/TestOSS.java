package cn.ws.test.aliyunOSS;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.*;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.List;

/*
 * @Author: cool
 * @Date: 2018/7/20 14:48
 */
public class TestOSS {
    // endpoint 访问OSS的域名
    private static final String endPoint = "https://oss-cn-beijing.aliyuncs.com";

    // accessKeyId和accessKeySecret OSS的访问密钥
    private static final String accessKeyId = "********";
    private static final String accessKeySecret = "****************";

    // Bucket 用来管理所存储Object的存储空间
    private static String bucketName = "test4wangshuang";

    //测试上传文件key
    private static final String fileKey = "my-file-key";
    //测试上传对象key
    private static final String testKey = "my-test-key";



    // 生成OSSClient
    OSSClient ossClient;

    @Before
    public void before() {
        ossClient = new OSSClient(endPoint, accessKeyId, accessKeySecret);
        // 判断Bucket是否存在
        if (ossClient.doesBucketExist(bucketName)) {
            System.out.println("您已经创建Bucket：" + bucketName + "。");
        } else {
            System.out.println("您的Bucket不存在，创建Bucket：" + bucketName + "。");
            // 创建Bucket
            ossClient.createBucket(bucketName);
        }

        // 查看Bucket信息
        BucketInfo info = ossClient.getBucketInfo(bucketName);
        System.out.println("Bucket " + bucketName + "的信息如下：");
        System.out.println("\t数据中心：" + info.getBucket().getLocation());
        System.out.println("\t创建时间：" + info.getBucket().getCreationDate());
        System.out.println("\t用户标志：" + info.getBucket().getOwner());
    }

    @Test
    public void testSave() {
        // 把字符串存入OSS，Object的名称为testKey
        InputStream is = new ByteArrayInputStream("Test OSS putObject".getBytes());
        // Object OSS存储数据的基本单元，称为OSS的对象或OSS的文件
        ossClient.putObject(bucketName, "test/" + testKey, is);
        System.out.println("Object：" + testKey + "存入OSS成功。");
    }

    @Test
    public void testDown() throws IOException {
        // 下载Object
        OSSObject ossObject = ossClient.getObject(bucketName, testKey);
        InputStream inputStream = ossObject.getObjectContent();
        StringBuilder objectContent = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String line = reader.readLine();
            if (line == null)
                break;
            objectContent.append(line);
        }
        inputStream.close();
        System.out.println("Object：" + testKey + "的内容是：" + objectContent);
    }

    @Test
    public void testUploadFile() {
        //运行时注意修改File路径及文件名
        ossClient.putObject(bucketName, fileKey, new File("F:\\Readme.txt"));
        System.out.println("Object：" + fileKey + "存入OSS成功。");
    }


    @Test
    public void testDown2Local() {
        // 下载object到本地文件
        ossClient.getObject(new GetObjectRequest(bucketName, fileKey), new File("F:\\Readme1.txt"));
    }

    @Test
    public void testLook() {
        // 查看Bucket中的Object
        ObjectListing objectListing = ossClient.listObjects(new ListObjectsRequest(bucketName).
                withMaxKeys(300));
        List<OSSObjectSummary> objectSummary = objectListing.getObjectSummaries();
        System.out.println("您有以下Object：");
        for (OSSObjectSummary object : objectSummary) {
            System.out.println("\t" + object.getKey());
        }
    }

    @Test
    public void testDelete() {
        // 删除Object
        ossClient.deleteObject(bucketName, testKey);
        System.out.println("删除Object：" + testKey + "成功。");
        ossClient.deleteObject(bucketName, fileKey);
        System.out.println("删除Object：" + fileKey + "成功。");
        testLook();

    }

}
