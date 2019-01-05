package com.wangming.pattern.creational.simpleFactory;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/5 10:22
 * @Description:
 */

public class VideoFactory {
    /**
     * @param type 可以使用枚举优化代码
     * @return
     */
    public static Video createVideo(String type) {
        Video video = null;
        switch (type) {
            case "java":
                video = new JavaVideo();
                break;
            case "python":
                video = new PythonVideo();
                break;
            default:
                break;
        }
        return video;
    }

    /**
     * 代码更加简洁
     * @return
     */
    public static Video createVideo(Class clazz) throws Exception {
        Video video = (Video) Class.forName(clazz.getName()).newInstance();
        return video;
    }
}
