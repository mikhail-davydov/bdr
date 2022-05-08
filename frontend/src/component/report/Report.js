import {Component} from "react";
import {AddReportForm} from "../add-report-form/AddReportForm";

import "./Report.css";

export class Report extends Component {

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