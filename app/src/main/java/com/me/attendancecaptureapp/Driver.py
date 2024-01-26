import cv2
import os


def register_student(roll_no, video_path):
    # Create a folder for the student who is being registered
    folder_name = f"{roll_no}"
    os.makedirs(folder_name, exist_ok=True)

    # Open the video file
    cap = cv2.VideoCapture(video_path)

    # Check if the video file is opened successfully
    if not cap.isOpened():
        print(f"Error opening video file: {video_path}")
        return

    # Read frames from the video
    frame_count = 0
    while True:
        ret, frame = cap.read()
        if not ret:
            print("End of video or error reading frames")
            break

        # Save the frame in the student's folder
        frame_name = os.path.join(folder_name, f"{roll_no}_{frame_count}.jpg")
        cv2.imwrite(frame_name, frame)

        # Display the frame (for testing initially)
        cv2.imshow("Capturing Frames", frame)
        cv2.waitKey(10)  # Adjustable delay

        frame_count += 1

    # Release the video file and close the window
    cap.release()
    cv2.destroyAllWindows()
