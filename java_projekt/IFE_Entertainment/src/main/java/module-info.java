/*
 * 1.0 2026-04-22 Luca Tauscher
 *
 * Copyright (c) 2025-2026 Gervithrall Systems GmbH. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Gervithrall Systems GmbH ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Gervithrall Systems GmbH.
 *
 * GERVITHRALL SYSTEMS GMBH MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
 * THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. GERVITHRALL SYSTEMS GMBH
 * SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */

/**
 * JavaDoc Luca pls
 * 
 * @author Luca Tauscher
 */
module SEG11.IFE_Entertainment {
    requires javafx.controls;
    requires javafx.fxml;

    opens SEG11.IFE_Entertainment to javafx.fxml;
    exports SEG11.IFE_Entertainment;
    
    opens SEG11.IFE_Entertainment.UIController to javafx.fxml;
    exports SEG11.IFE_Entertainment.UIController;
    
    opens SEG11.IFE_Entertainment.UIFourConnectController to javafx.fxml;
    exports SEG11.IFE_Entertainment.UIFourConnectController;
    
    opens SEG11.IFE_Entertainment.Infrastructure to javafx.fxml;
    exports SEG11.IFE_Entertainment.Infrastructure;
    
    exports SEG11.IFE_Entertainment.GameCore;
    exports SEG11.IFE_Entertainment.FourConnect;
}
