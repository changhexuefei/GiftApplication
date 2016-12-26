package com.example.gao.giftapplication.http.response;

import okhttp3.Call;



public interface ResponseHandler {
	void onError(Call call, Exception e, int id);

	void onSuccess(String response, int id);

	void inProgress(float progress, long total, int id);
}
