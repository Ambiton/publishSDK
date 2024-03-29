package com.indoor.data.http;


import com.indoor.data.entity.author.AuthorData;
import com.indoor.data.entity.author.AuthorResponse;
import com.indoor.data.entity.projectareo.ProjectAreaData;
import com.indoor.data.local.db.UserActionData;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.Header;

/**
 * Created by Aaron on  2019/3/26.
 */
public interface HttpDataSource {
    Observable<BaseResponse<String>> submitLogRecord(@Header("Access-Token") String token, @Body List<UserActionData> userActionDatas);

    Observable<BaseResponse<String>> verifyAuth(@Body AuthorData authorData);

    Observable<BaseResponse<String>> getProjectAreaData(@Body ProjectAreaData projectArea);

}
