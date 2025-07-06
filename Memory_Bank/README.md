# Tổng quan cơ chế cache IP game

## 1. Lưu IP server trong runtime
- Sau khi lấy được IP server, giá trị này được lưu vào biến tĩnh `GameMidlet.IP`.
- Biến này dùng để truy cập server trong suốt phiên làm việc hiện tại của game.

## 2. Lưu chỉ số server vào RMS (Record Management System)
- Chỉ số server (`nr_bo.m`) sẽ được lưu vào bộ nhớ RMS với key `"svselect"` bằng lệnh `Rms.saveRMSInt("svselect", nr_bo.m);`.
- Khi khởi động lại game, chỉ số này sẽ được lấy ra từ RMS để xác định lại IP server tương ứng.
- Việc này giúp game nhớ server đã chọn giữa các lần đăng nhập.

## 3. Tóm tắt luồng hoạt động
- Khi chọn server, IP sẽ được gán vào `GameMidlet.IP` và chỉ số server được lưu vào RMS.
- Khi mở lại game, chỉ số server được lấy từ RMS, sau đó truy xuất IP tương ứng từ mảng `nr_bo.b`.

---

**Tài liệu này giúp thành viên mới hiểu rõ nơi cache IP và cách hoạt động của hệ thống lưu trữ IP server trong game.**
