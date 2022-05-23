package com.IT16308.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class uploadFileUtils {

	public File handleUploadFile(MultipartFile uploadFile) {
		String folderPath = "\\Users\\ACER\\Documents\\GitHub\\hoangVietDuc_IT16308\\src\\main\\webapp\\storage";
		File myUploadFolder = new File(folderPath);

		if (!myUploadFolder.exists()) { // ktra sự tồn tại của folder
			myUploadFolder.mkdirs(); // tạo mới nếu k tồn tại
		}
		// lưu file vào thư mục đã chọn
		File saveFile = null;
		try {
			saveFile = new File(myUploadFolder, uploadFile.getOriginalFilename());
			uploadFile.transferTo(saveFile);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		return saveFile;
	}
}
