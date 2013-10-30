/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.module.facebook.automation;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.module.facebook.automation.testcases.*;

@RunWith(Categories.class)
@IncludeCategory(RegressionTests.class)
@SuiteClasses({
	AttendEventTestCases.class,
	DeclineEventTestCases.class,
	DeleteObjectTestCases.class,
	DislikeTestCases.class,
	DownloadImageTestCases.class,
	GetAlbumCommentsTestCases.class,
	GetAlbumPhotosTestCases.class,
	GetAlbumTestCases.class,
	GetApplicationAlbumsTestCases.class,
	GetApplicationEventsTestCases.class,
	GetApplicationInsightsTestCases.class,
	GetApplicationLinksTestCases.class,
	GetApplicationNotesTestCases.class,
	GetApplicationPhotosTestCases.class,
	GetApplicationPictureTestCases.class,
	GetApplicationStatusesTestCases.class,
	GetApplicationTaggedTestCases.class,
	GetApplicationTestCases.class,
	GetApplicationVideosTestCases.class,
	GetApplicationWallTestCases.class,
	GetEventAttendingTestCases.class,
	GetEventDeclinedTestCases.class,
	GetEventInvitedTestCases.class,
	GetEventMaybeTestCases.class,
	GetEventNoReplyTestCases.class,
	GetEventPhotosTestCases.class,
	GetEventPictureTestCases.class,
	GetEventTestCases.class,
	GetEventWallTestCases.class,
	GetGroupMembersTestCases.class,
	GetGroupPictureTestCases.class,
	GetGroupTestCases.class,
	GetGroupWallTestCases.class,
	GetLinkCommentsTestCases.class,
	GetLinkTestCases.class,
	GetNoteCommentsTestCases.class,
	GetNoteLikesTestCases.class,
	GetNoteTestCases.class,
	GetPageAlbumsTestCases.class,
	GetPageCheckinsTestCases.class,
	GetPageEventsTestCases.class,
	GetPageGroupsTestCases.class,
	GetPageLinksTestCases.class,
	GetPageNotesTestCases.class,
	GetPagePhotosTestCases.class,
	GetPagePictureTestCases.class,
	GetPagePostsTestCases.class,
	GetPageStatusesTestCases.class,
	GetPageTaggedTestCases.class,
	GetPageTestCases.class,
	GetPageVideosTestCases.class,
	GetPageWallTestCases.class,
	GetPhotoCommentsTestCases.class,
	GetPhotoLikesTestCases.class,
	GetPhotoTagsTestCases.class,
	GetPhotoTestCases.class,
	GetPostCommentsTestCases.class,
	GetPostTestCases.class,
	GetStatusCommentsTestCases.class,
	GetStatusTestCases.class,
	GetUserAccountsTestCases.class,
	GetUserActivitiesTestCases.class,
	GetUserAlbumsTestCases.class,
	GetUserBooksTestCases.class,
	GetUserCheckinsTestCases.class,
	GetUserEventsTestCases.class,
	GetUserFriendsTestCases.class,
	GetUserGroupsTestCases.class,
	GetUserHomeTestCases.class,
	GetUserInboxTestCases.class,
	GetUserInterestsTestCases.class,
	GetUserLikesTestCases.class,
	GetUserLinksTestCases.class,
	GetUserMoviesTestCases.class,
	GetUserMusicTestCases.class,
	GetUserNotesTestCases.class,
	GetUserOutboxTestCases.class,
	GetUserPhotosTestCases.class,
	GetUserPictureTestCases.class,
	GetUserPostsTestCases.class,
	GetUserSearchTestCases.class,
	GetUserStatusesTestCases.class,
	GetUserTaggedTestCases.class,
	GetUserTelevisionTestCases.class,
	GetUserTestCases.class,
	GetUserUpdatesTestCases.class,
	GetUserVideosTestCases.class,
	GetUserWallTestCases.class,
	GetVideoCommentsTestCases.class,
	GetVideoTestCases.class,
	InviteUserTestCases.class,
	LikeTestCases.class,
	LoggedUserDetailsTestCases.class,
	PublishAlbumTestCases.class,
	PublishCommentTestCases.class,
	PublishEventTestCases.class,
	PublishLinkTestCases.class,
	PublishMessageTestCases.class,
	PublishNoteTestCases.class,
	PublishPhotoTestCases.class,
	PublishVideoTestCases.class,
	SearchCheckinsTestCases.class,
	SearchEventsTestCases.class,
	SearchGroupsTestCases.class,
	SearchPagesTestCases.class,
	SearchPostsTestCases.class,
	SearchUsersTestCases.class,
	TagPhotoTestCases.class,
	TentativeEventTestCases.class,
	UninviteUserTestCases.class,
//	AttendEventTestCases.class,
//	DeclineEventTestCases.class,
//	DeleteObjectTestCases.class,
//	DislikeTestCases.class,
//	DownloadImageTestCases.class,
//	GetAlbumCommentsTestCases.class,
//	GetAlbumPhotosTestCases.class,
//	GetAlbumTestCases.class,
//	GetApplicationAlbumsTestCases.class,
//	GetApplicationEventsTestCases.class,
//	GetApplicationInsightsTestCases.class,
//	GetApplicationLinksTestCases.class,
//	GetApplicationNotesTestCases.class,
//	GetApplicationPhotosTestCases.class,
//	GetApplicationPictureTestCases.class,
//	GetApplicationStatusesTestCases.class,
//	GetApplicationTaggedTestCases.class,
//	GetApplicationTestCases.class,
//	GetApplicationVideosTestCases.class,
//	GetApplicationWallTestCases.class,
//	GetEventAttendingTestCases.class,
//	GetEventDeclinedTestCases.class,
//	GetEventInvitedTestCases.class,
//	GetEventMaybeTestCases.class,
//	GetEventNoReplyTestCases.class,
//	GetEventPhotosTestCases.class,
//	GetEventPictureTestCases.class,
//	GetEventTestCases.class,
//	GetEventWallTestCases.class,
//	GetGroupMembersTestCases.class,
//	GetGroupPictureTestCases.class,
//	GetGroupTestCases.class,
//	GetGroupWallTestCases.class,
//	GetLinkCommentsTestCases.class,
//	GetLinkTestCases.class,
//	GetNoteCommentsTestCases.class,
//	GetNoteLikesTestCases.class,
//	GetNoteTestCases.class,
//	GetPageAlbumsTestCases.class,
//	GetPageCheckinsTestCases.class,
//	GetPageEventsTestCases.class,
//	GetPageGroupsTestCases.class,
//	GetPageLinksTestCases.class,
//	GetPageNotesTestCases.class,
//	GetPagePhotosTestCases.class,
//	GetPagePictureTestCases.class,
//	GetPagePostsTestCases.class,
//	GetPageStatusesTestCases.class,
//	GetPageTaggedTestCases.class,
//	GetPageTestCases.class,
//	GetPageVideosTestCases.class,
//	GetPageWallTestCases.class,
//	GetPhotoCommentsTestCases.class,
//	GetPhotoLikesTestCases.class,
//	GetPhotoTagsTestCases.class,
//	GetPhotoTestCases.class,
//	GetPostCommentsTestCases.class,
//	GetPostTestCases.class,
//	GetStatusCommentsTestCases.class,
//	GetStatusTestCases.class,
//	GetUserAccountsTestCases.class,
//	GetUserActivitiesTestCases.class,
//	GetUserAlbumsTestCases.class,
//	GetUserBooksTestCases.class,
//	GetUserCheckinsTestCases.class,
//	GetUserEventsTestCases.class,
//	GetUserFriendsTestCases.class,
//	GetUserGroupsTestCases.class,
//	GetUserHomeTestCases.class,
//	GetUserInboxTestCases.class,
//	GetUserInterestsTestCases.class,
//	GetUserLikesTestCases.class,
//	GetUserLinksTestCases.class,
//	GetUserMoviesTestCases.class,
//	GetUserMusicTestCases.class,
//	GetUserNotesTestCases.class,
//	GetUserOutboxTestCases.class,
//	GetUserPhotosTestCases.class,
//	GetUserPictureTestCases.class,
//	GetUserPostsTestCases.class,
//	GetUserSearchTestCases.class,
//	GetUserStatusesTestCases.class,
//	GetUserTaggedTestCases.class,
//	GetUserTelevisionTestCases.class,
//	GetUserTestCases.class,
//	GetUserUpdatesTestCases.class,
//	GetUserVideosTestCases.class,
//	GetUserWallTestCases.class,
//	GetVideoCommentsTestCases.class,
//	GetVideoTestCases.class,
//	InviteUserTestCases.class,
//	LikeTestCases.class,
//	LoggedUserDetailsTestCases.class,
//	PublishAlbumTestCases.class,
//	PublishCommentTestCases.class,
//	PublishEventTestCases.class,
//	PublishLinkTestCases.class,
//	PublishMessageTestCases.class,
//	PublishNoteTestCases.class,
//	PublishPhotoTestCases.class,
//	PublishVideoTestCases.class,
//	SearchCheckinsTestCases.class,
//	SearchEventsTestCases.class,
//	SearchGroupsTestCases.class,
//	SearchPagesTestCases.class,
//	SearchPostsTestCases.class,
//	SearchUsersTestCases.class,
//	TagPhotoTestCases.class,
//	TentativeEventTestCases.class,
//	UninviteUserTestCases.class
})

public class RegressionTestSuite {
	
}