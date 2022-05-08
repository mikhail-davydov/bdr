import {Component} from "react";
import {AddReportForm} from "../add-report-form/AddReportForm";

import "./ReportsTab.css";

export class ReportsTab extends Component {

    render() {
        return (
            <div className="report-container">
                <AddReportForm/>
                <div className="report-content">
                    Here is the Report tab content
                </div>
            </div>
        );
    }

}