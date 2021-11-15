//
//  ViewController.swift
//  AppA
//
//  Created by Elena on 2021/11/11.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var sendData: UITextField! //전달할 데이터
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
    }


    @IBAction func tabMoveAppB(_ sender: UIButton) { // appB로 이동 버튼 클릭시
        
        let appScheme = "appb://" // 앱 scheme
        // scheme://?parameter'
//        URLComponents(fro)
        let appUrl = URL(string: appScheme)! // canOpenURL은 URL타입만 받기때문에 형변환을 해야한다.
        
        if UIApplication.shared.canOpenURL(appUrl){ // 앱이 열리는지 확인
            UIApplication.shared.open(appUrl, options: [:], completionHandler: nil)
        } else {
            print("앱을 연결 할 수 없습니다.")
            // js 페이지 연결 (웹사이트) 하여 이동하도록 asset 구현
            // UIApplication.shared.open() 이용
        }

        
    }
}

