/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nro;

/**
 *
 * @author thanhtuanad
 */
public class Time {
    public static float timeScale = 1.0f;  // Mặc định là 1 (bình thường)

    // Hàm để thay đổi thời gian (tốc độ)
   public static void setTimeScale(float scale) {
        timeScale = scale <= 0 ? 0.1f : scale; // Giới hạn không nhỏ hơn 0.1
        System.out.println("Tốc độ game mới: " + timeScale);
    }

    // Hàm này sẽ được gọi trong game để điều chỉnh các hành động dựa trên timeScale
    public static void update(float deltaTime) {
        float adjustedTime = deltaTime * timeScale;
        // Cập nhật các hành động của game sử dụng adjustedTime thay vì deltaTime
    }
}
